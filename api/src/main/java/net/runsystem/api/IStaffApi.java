package net.runsystem.api;

import net.runsystem.domain.StaffEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author GMO_ThanhND
 * @version 1.0
 * @since 3/23/2022
 */

@RequestMapping("/api/v1/staff")
public interface IStaffApi {
    @GetMapping("/list")
    List<StaffEntity> getAllStaff();
}
