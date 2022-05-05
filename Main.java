package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.*;

        class Main{
            public static void main(String[] args) {
                Logger log = Logger.getLogger(Main.class.getName());
                log.setLevel(Level.INFO);
                ConsoleHandler ch = new ConsoleHandler();
                log.addHandler(ch);
                SimpleFormatter sf = new SimpleFormatter();
                ch.setFormatter(sf);

                Scanner in = new Scanner(System.in);
                System.out.println("Курс биткоина на данный момент - 4 396 820 руб.");
                log.info("Курс биткоина - 4 396 820 руб.");
                System.out.println("Введите количество биткойнов для перевода в рубли:");
                log.info("Введём количество биткоинов");
                BigDecimal bitcoin = BigDecimal.valueOf(in.nextDouble());
                BigDecimal bitCourse = BigDecimal.valueOf(4396820);
                BigDecimal multi = bitcoin.multiply(bitCourse);
                log.info("Количество биткоинов " + bitcoin);

                System.out.println("Стоимость биткоина в количестве " + bitcoin + " шт. равен " + multi + " руб.");
                log.info("Стоимость биткоина в количестве " + bitcoin + " шт. равен " + multi + " руб.");
            }
        }
