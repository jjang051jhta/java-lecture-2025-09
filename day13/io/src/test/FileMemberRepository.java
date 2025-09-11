package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMemberRepository implements MemberRepository {
    @Override
    public void add(Member member) {
        //file 저장
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("temp/member-list.txt",true))){
            bufferedWriter.write(member.getID()+","+member.getName()+","+member.getAge());
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> memberList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("temp/member-list.txt"))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String member [] = line.split(",");
                memberList.add(new Member(member[0],member[1],Integer.valueOf(member[2])));
            }
            return memberList;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
