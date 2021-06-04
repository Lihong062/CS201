public class Person201Driver {
    public static void main(String[] args) {
        Person201 p = new Person201();
        Person201 q =
                new Person201("Ricardo",-34.6037, -58.3816,"harambee");
        Person201 r =
                new Person201("Gelareh",-33.89,151.2,"affective");

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        System.out.printf("%s %s\n",q.getName(), q.getPhrase());
        System.out.printf("%s %s\n",r.getName(), r.getPhrase());
    }
}
