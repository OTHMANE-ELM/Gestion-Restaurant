package service;

import dao.CommandeDao;
import model.Commande;
import java.util.List;
import java.util.Map;

public class CommandeService {

    private final CommandeDao cmdao = new CommandeDao();

    public Commande getCommande(int id) throws Exception {
        return cmdao.findById(id);
    }

    public List<Commande> listCommandes() throws Exception {
        return cmdao.findAll();
    }

    public Commande createCommande(Commande cm) throws Exception {
        cmdao.insert(cm);
        return cm;
    }

    public boolean updateCommande(Commande cm) throws Exception {
        return cmdao.update(cm);
    }

    public boolean deleteCommande(int id) throws Exception {
        return cmdao.delete(id);
    }

    public Map<String, Double> chiffreAffaireParPlat() throws Exception {
        return cmdao.chiffreAffiarePlat();
    }

    public double calculerRecettesTotal() throws Exception {
        return cmdao.calculerRecettes();
    }

    public List<Map<String, Object>> platsPopulairesRestau() throws Exception {
        return cmdao.platsPopulaires();
    }
}
