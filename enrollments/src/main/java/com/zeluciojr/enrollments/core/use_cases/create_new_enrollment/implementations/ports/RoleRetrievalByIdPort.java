package com.zeluciojr.enrollments.core.use_cases.create_new_enrollment.implementations.ports;

import com.cae.ports.FunctionPort;
import com.zeluciojr.enrollments.core.entities.Role;

import java.util.Optional;
import java.util.UUID;

public abstract class RoleRetrievalByIdPort extends FunctionPort<UUID, Optional<Role>> {
}
