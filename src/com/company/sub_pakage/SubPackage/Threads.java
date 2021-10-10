package com.company.sub_pakage.SubPackage;

public class Threads extends Thread{

        // переопределение метода run ()
        @Override
        public void run () {
// цикл дочернего потока
            for (int i=1;i <=5;i++) {
                System.out.println ("Дочерний поток: "+i);
                try {
                    Thread.sleep (2500);
                }
                catch (InterruptedException e) {
                    System.out.println ("«Прерывание дочернего потока»");
                }
            }
        }
    }
    // главный класс программы
    class Listing10_1 {
        public static void main (String [] args) throws InterruptedException {
// создаем объект дочернего потока
            Threads thr=new Threads ();
// запускаем дочерний поток
            System.out.println ("«Запуск дочернего потока»");
            thr.start ();
// цикл главного потока
            for (int j=0;j <=5;j++) {
                System.out.println ("Главный поток: "+j);
                Thread.sleep (1500);
            }
// проверяем, работает ли дочерний поток
// если да, то ждем, пока он завершит работу
            if(thr.isAlive ()) {
                System.out.println ("«Ждем завершение дочернего потока»");
                thr.join ();
            }
            System.out.println ("«Все процессы завершены»");
        }
    }


//    этот пример для того, чтобы (видимо) воспользоваться только конструктором Runnable, а не всем классом Thread

class MyThreadClass implements Runnable {
    // описание метода run ()
    @Override
    public void run () {
        for (int i=1;i <=5;i++) {
            System.out.println ("Дочерний поток: "+i);
            try {
                Thread.sleep (2500);
            }
            catch (InterruptedException e) {
                System.out.println ("«Прерывание дочернего потока»");
            }
        }
    }
}
class Listing10_2 {
    public static void main (String [] args) throws InterruptedException {
// создаем объект дочернего потока
// используя сокращенную запись


        Thread thr=new Thread (new MyThreadClass ());  //Вот все отличие

        
// запускаем дочерний поток
        System.out.println ("«Запуск дочернего потока»");
        thr.start ();
// цикл главного потока
        for (int j=0;j <=5;j++) {
            System.out.println ("Главный поток: "+j);
            Thread.sleep (1500);
        }
// проверяем, работает ли дочерний поток
// если да, то ждем, пока он завершит работу
        if(thr.isAlive ()) {
            System.out.println ("«Ждем завершение дочернего потока»");
            thr.join ();
        }
        System.out.println ("«Все процессы завершены»");
    }
}


    interface A {
        void a();
        void b();
        void c();
        void d();
        void e();
        }
abstract class B implements A { //1
    public void a() {
        System.out.print("a");
    }
    public void d() {
        System.out.print("d");
    }
}
abstract class C extends B {
    public void b() {
        System.out.print("b");
    }
    public void c() {
        System.out.print("c");
    }
    public void d() {
        System.out.print("D");
    }
}

class Programm {
    public static void main(String[] args) {
        A c = new C() { //2
            public void b() {
                System.out.print("B");
            }
            public void e() {
                System.out.print("e");
            }
        };
        c.a();
        c.b();
        c.c();
        c.d();
        c.e();
    }
}



class Program {
    public static void main(String[] args) {
        Object obj = new Object();
        java.lang.Class<?> clazz = obj.getClass();
        System.out.print(clazz.getSuperclass() + ", ");
        java.lang.Class<?> clazzClass = clazz.getClass();
        System.out.print(clazzClass.getSuperclass());
    }
}
