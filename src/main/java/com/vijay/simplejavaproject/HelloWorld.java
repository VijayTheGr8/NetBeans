package com.vijay.simplejavaproject;

/**
 *
 * @author vijay
 */
public class HelloWorld {
      
      private String name;
      private short age;
      
      public HelloWorld() {
          this.name = "";
          this.age = 0;
      }

      public HelloWorld(String name, short age) {
            this.name = name;
            this.age = age;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public short getAge() {
            return age;
      }

      public void setAge(short age) {
            this.age = age;
      }
      
}
