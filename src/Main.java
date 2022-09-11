import java.math.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Robot robot = new Robot(10, -20, Direction.DOWN);
//        moveRobot(robot, 0, 0);
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";

        barsik.sayMeow();
        barsik.jump();

        Person tech1 = new Person("Al");
        Person tech2 = new Person("Vova");
        Person manager = new Person("Vasya");
        String tech1Name =tech1.getName();
        String managerName = manager.getName();
        tech1.hello();
        tech1.display();


    }
    static class Work {



    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        // your code
//            int x = robot.getX();
//            int y = robot.getY();

        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection()+" start");
//                  -10, 20
        if (robot.getX() > toX) {
            while (robot.getDirection() != (Direction.LEFT)) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != (Direction.RIGHT)) {
                robot.turnRight();
            }
            System.out.println(robot.getDirection());
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            } while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            } while (robot.getY() != toY) {
                robot.stepForward();
            }
        }


        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection()+" end");
//            robot.turnRight();
//            robot.stepForward();
//            robot.stepForward();
//            robot.stepForward();
//            System.out.println(x+" "+y + " " + robot.getDirection());
    }

    public static class Person {


        String name;
        public Person(String name){

            this.name=name;
        }
        public String getName(){

            return name;
        }

        public void display(){

            System.out.println("Name: " + name);
        }
        public void hello(){

            System.out.println("Hello");
        }


    }

    public static class Cat {

        String name;
        int age;

        public void sayMeow() {
        System.out.println("Мяу!");
        }

        public void jump() {
        System.out.println("Прыг-скок!");
        }
    }
}



