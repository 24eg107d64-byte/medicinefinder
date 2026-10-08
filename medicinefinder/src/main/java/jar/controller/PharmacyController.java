package jar.controller;

import jar.entity.Pharmacy;
import jar.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
@CrossOrigin("*")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @PostMapping
    public Pharmacy addPharmacy(
            @RequestBody Pharmacy pharmacy) {

        return pharmacyService.savePharmacy(pharmacy);
    }

    @GetMapping
    public List<Pharmacy> getAllPharmacies() {

        return pharmacyService.getAllPharmacies();
    }

    @GetMapping("/{id}")
    public Pharmacy getPharmacy(
            @PathVariable Long id) {

        return pharmacyService.getPharmacyById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePharmacy(
            @PathVariable Long id) {

        pharmacyService.deletePharmacy(id);

        return "Pharmacy Deleted Successfully";
    }
}