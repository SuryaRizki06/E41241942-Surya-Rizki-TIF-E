

public class managingpeople{
    
    public static void main(String[] args) {
         
        Person p1 = new Person("Aerial", 37);
        Person p2 = new Person("Joseph", 15);

      if (p1.getAge()== p2.getAge()){
          System.out.println( "umur dari " + p1.getName()+" sama dengan umur " + p2.getName());
      }
      else{
          System.out.println("umur dari "+p1.getName() +" tidak sama dengan umur "+ p2.getName());
      }
    }
}
