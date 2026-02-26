package service;

import model.Plat;
import dao.PlatDao;
import java.util.List;

public class PlatService {

    private final PlatDao pdao = new PlatDao();

    public Plat getPlat(int id) throws Exception {
        return pdao.findById(id);
    }

    public List<Plat> listPlats() throws Exception {
        return pdao.findAll();
    }

    public boolean createPlat(Plat p) {
        try {
            pdao.insert(p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePlat(Plat p) throws Exception {
        return pdao.update(p);
    }

    public boolean deletePlat(int id) throws Exception {
        return pdao.delete(id);
    }

    public List<Plat> filtrageCategoriePlat(String categorie) throws Exception {
        return pdao.filtrageCategorie(categorie);
    }

    public List<String> findCategoriesPlat() throws Exception {
        return pdao.findCategories();
    }

}
