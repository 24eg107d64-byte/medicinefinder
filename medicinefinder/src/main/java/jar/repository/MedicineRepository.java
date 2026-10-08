package jar.repository;

import jar.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    List<Medicine> findByMedicineNameContainingIgnoreCase(String medicineName);

    List<Medicine> findByPrescriptionCode(String prescriptionCode);
}