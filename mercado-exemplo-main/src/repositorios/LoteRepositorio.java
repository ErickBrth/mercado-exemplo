package repositorios;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exemplo.Lote;

public class LoteRepositorio {
    Map<String, Lote> lotes;
	
	public LoteRepositorio() {
		this.lotes = new HashMap<String, Lote>();
	}

    public Collection<Lote> getAll() {
		return this.lotes.values();
	}

    public Lote getLote(String id){
        return this.lotes.get(id);
    }

    public void delLote(String id){
        this.lotes.remove(id);
    }

    public void editLote(Lote lote){
        this.lotes.replace(lote.getId(), lote);
    }

    public String addLote(Lote lote){
        this.lotes.put(lote.getId(), lote);
        return lote.getId();
    }


}
