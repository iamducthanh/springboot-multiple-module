package net.runsystem.repository;

import net.runsystem.domain.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO_ThanhND
 * @version 1.0
 * @since 3/23/2022
 */
@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, String> {
}
