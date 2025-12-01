package com.trabalho.trabalho.Models.Services;

import com.trabalho.trabalho.Models.Material;
import com.trabalho.trabalho.Models.MaterialRepository;
import org.springframework.stereotype.Service;

@Service
public class MaterialService extends BaseService<Material, MaterialRepository> {
    public MaterialService(MaterialRepository materialRepository) {
        super(materialRepository);
    }
}
