package jar.controller;

import jar.entity.Medicine;
import jar.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin("*")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping
    public Medicine addMedicine(
            @RequestBody Medicine medicine) {

        return medicineService.saveMedicine(medicine);
    }

    @GetMapping
    public List<Medicine> getAllMedicines() {

        return medicineService.getAllMedicines();
    }

    @GetMapping("/search/{name}")
    public List<Medicine> searchMedicine(
            @PathVariable String name) {

        return medicineService.searchMedicine(name);
    }

    @GetMapping("/code/{code}")
    public List<Medicine> searchByCode(
            @PathVariable String code) {

        return medicineService.searchByCode(code);
    }

    @DeleteMapping("/{id}")
    public String deleteMedicine(
            @PathVariable Long id) {

        medicineService.deleteMedicine(id);

        return "Medicine Deleted Successfully";
    }
}