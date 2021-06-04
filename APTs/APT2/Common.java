public class Common {
    public int count (String a, String b) {
        String[] lista = a.split(""); 
        String[] listb = b.split("");
        int tracker = 0; 

        for(int i = 0; i < lista.length; i++){
            for(int j = 0; j < listb.length; j++){
                if(listb[j].equals(lista[i]) && !listb[j].equals("")){
                    tracker += 1; 
                    lista[i] = "";
                    listb[j] = "";
                }
            }
        }
        return tracker; 
    }
}