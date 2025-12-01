package Models.Services;

import Models.Material;
import Models.MaterialRepository;
import org.springframework.stereotype.Service;

@Service
public class MaterialService extends BaseService<Material, MaterialRepository> {
    public MaterialService(MaterialRepository materialRepository) {
        super(materialRepository);
    }
}
