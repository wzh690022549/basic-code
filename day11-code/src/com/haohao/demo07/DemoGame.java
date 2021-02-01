package com.haohao.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Athey");

//        hero.setSkill(new SkillImpl());
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill);
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~pia~Biu~pia~");
            }
        });

        hero.attack();
    }
}
