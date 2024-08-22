package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> ListaTarefas;
    
    public ListaTarefas() {
        this.ListaTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        ListaTarefas.add(new Tarefa(descricao));
    } 
    public void removerTarefa(String descricao){
        List<Tarefa> TarefasParaRemover = new ArrayList<>(); 
        for (Tarefa  t : ListaTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                TarefasParaRemover.add(t);
            }
        }
        ListaTarefas.removeAll(TarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return ListaTarefas.size();
    }
    public List<String> obterDescricoesTarefas() {
        List<String> DescricaoList = new ArrayList<>();
        for (Tarefa t : ListaTarefas){
            DescricaoList.add(t.getDescricao());
        }
        return DescricaoList;
    }
}
