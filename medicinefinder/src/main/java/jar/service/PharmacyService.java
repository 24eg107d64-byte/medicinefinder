package jar.service;

import jar.entity.Pharmacy;
import jar.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyService {

    @Autowired
    private PharmacyRepository pharmacyRepository;

    public Pharmacy savePharmacy(Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    public List<Pharmacy> getAllPharmacies() {
        return pharmacyRepository.findAll();
    }

    public Pharmacy getPharmacyById(Long id) {
        return pharmacyRepository.findById(id).orElse(null);
    }

    public void deletePharmacy(Long id) {
        pharmacyRepository.deleteById(id);
    }
}