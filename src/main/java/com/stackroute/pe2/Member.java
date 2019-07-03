package com.stackroute.pe2;


    public class Member {   //Member class with variables and membervariable having member instance
        float salary;
        int age;
        String name;
    }
         class MemberVariable {
            Member member = new Member();

            public Member display(int age, float salary, String name) {
                member.name = name;
                member.age = age;
                member.salary = salary;
                return member;

        }

    }
