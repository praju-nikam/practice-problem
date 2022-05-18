package com.bridgelabz.Interface;
interface Language{
    void getName(String name);
}
// class implements interface
class ProgrammingLanguage implements Language{
    // implements abstract method

    @Override
    public void getName(String name) {
        System.out.println("Programming Language: "+name);

    }
}
public class InterfaceLanguage
{
    public static void main(String[] args) {
      ProgrammingLanguage language = new ProgrammingLanguage();
      language.getName("Java");
    }
}
