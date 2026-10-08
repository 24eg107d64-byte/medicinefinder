package jar.service;

import jar.entity.Medicine;
import jar.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public List<Medicine> searchMedicine(String name) {
        return medicineRepository
                .findByMedicineNameContainingIgnoreCase(name);
    }

    public List<Medicine> searchByCode(String code) {
        return medicineRepository
                .findByPrescriptionCode(code);
    }

    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }
}