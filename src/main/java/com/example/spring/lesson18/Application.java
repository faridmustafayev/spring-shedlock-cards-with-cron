package com.example.spring.lesson18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
    databaseChangeLog:
  - changeSet:
      id: Create table for scheduler
      author: Farid Mustafayev
      changes:
        - createTable:
            tableName: shedlock
            columns:
              - column:
                  name: name
                  type: varchar(64)
                  constraints:
                    primaryKey: true
                    nullable: false
              - column:
                  name: lock_until
                  type: timestamp
              - column:
                  name: locked_at
                  type: timestamp
              - column:
                  name: locked_by
                  type: varchar(256)
                  constraints:
                    nullable: false
     */

}
