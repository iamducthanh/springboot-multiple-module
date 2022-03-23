package net.runsystem.api.impl;

import lombok.RequiredArgsConstructor;
import net.runsystem.api.IStaffApi;
import net.runsystem.domain.StaffEntity;
import net.runsystem.repository.StaffRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author: GMO_ThanhND
 * @version: 1.0
 * @since 3/23/2022 5:32 PM
 */
@RestController
@RequiredArgsConstructor
public class StaffApi implements IStaffApi {
 private final StaffRepository staffRepository;

 @Override
 public List<StaffEntity> getAllStaff() {
  return staffRepository.findAll();
 }
}
