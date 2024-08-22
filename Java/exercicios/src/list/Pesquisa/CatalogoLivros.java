package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listLivro; 

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>(); 
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivro.add(new Livro(titulo,autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> LivrosPesquisados = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro L : listLivro){
                if(L.getAutor().equalsIgnoreCase(autor)){
                    LivrosPesquisados.add(L);
                }
            }
        }
        return LivrosPesquisados;
    }
    public List<Livro> pesquisarPorIntervaloAnos (int AnoInicial, int AnoFinal){
        List<Livro> LivrosPesquisados = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for (Livro L : listLivro){
                if ((AnoInicial <= L.getAnoPublicacao())&&(AnoFinal > L.getAnoPublicacao())){
                    LivrosPesquisados.add(L);
                }
            }
        }
        return LivrosPesquisados;
    }
    public Livro pesquisarPorTitulo(String Titulo){
        Livro livroPesquisado = null;
        if(!listLivro.isEmpty()){
            for(Livro L : listLivro){
                if(L.getTitulo().equalsIgnoreCase(Titulo)){
                    livroPesquisado = L;
                    break;
                }
            }
        }
        return livroPesquisado;
    }
}
