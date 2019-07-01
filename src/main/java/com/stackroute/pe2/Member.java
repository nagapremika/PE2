package com.stackroute.pe2;


    public class Member {
        float salary;
        int age;
        String name;

        public class MemberVariable {
            Member member = new Member();

            public Member display(int age, float salary, String name) {
                member.name = name;
                member.age = age;
                member.salary = salary;
                return member;
            }
        }
    }
