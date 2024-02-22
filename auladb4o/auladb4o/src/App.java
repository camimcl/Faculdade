import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Livro umLivro = new Livro();
        ObjectContainer db;
        db = Db4o.openFile("meubanco.dbo");
        umLivro.setTitulo("Metodologia Científica");
        umLivro.setAutor("Fernando");
        umLivro.setEditora("UNINASSAU");
        umLivro.setAnoedição("2024"); 
        umLivro.setLocalização("Recife/PE");
        db.store(umLivro);
        db.close();
        
        db = Db4o.openFile("meubanco.dbo");
        umLivro.setTitulo("testando");
        umLivro.setAutor("maria");
        umLivro.setEditora("mia pica");
        umLivro.setAnoedição("2024"); 
        umLivro.setLocalização("Paulo Afonso/BA");
        db.store(umLivro);
        db.close();
        
        ObjectSet<Livro>lista;
        db= Db4o.openFile("meubanco.dbo");
        lista= db.query(Livro.class);
        while (lista.hasNext()) {
            umLivro = lista.next();
            System.out.println("################");
            System.out.println(umLivro.getAutor());
            System.out.println(umLivro.getEditora());
            System.out.println(umLivro.getAnoedição());
            System.out.println(umLivro.getLocalização());
            System.out.println(umLivro.getTitulo());
        }
        db.close();

    }

}
