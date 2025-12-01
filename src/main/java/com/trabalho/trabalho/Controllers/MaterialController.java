package com.trabalho.trabalho.Controllers;

import com.trabalho.trabalho.Models.Services.MaterialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalho.trabalho.Models.Material;

@RestController
@RequestMapping
public class MaterialController extends Controller<Material, MaterialService>{
    public MaterialController(MaterialService material) {
        super(material);
    }
}
