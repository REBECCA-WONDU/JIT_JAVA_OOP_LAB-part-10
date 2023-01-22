class person {
    private int age;

    person(int age) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{
    public static void main(String[] args){
        person p1=new person(24);
        p1.setAge(24);
        System.out.println("The person is" + p1.getAge()  +" years old");
    }
}
