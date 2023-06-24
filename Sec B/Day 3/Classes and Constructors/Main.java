class Car{

int id=10;
String brand="Ford";

Car(){
}

Car(int id, String brand){
this.id =id;
this.brand=brand;

}

void setId(int id){
this.id= id;
}


void getId(){
System.out.println(this.id);
}
}




class Main{

public static void main(String[] args){

int a=50;
Car c1= new Car();

Car c2 = new Car(1000 , "Tesla");
System.out.println("Hello Section B");
System.out.println(a);
System.out.println(c1.id);
System.out.println(c1.brand);


System.out.println(c2.id);
System.out.println(c2.brand);

c1.setId(2000);
c1.getId();

}
}