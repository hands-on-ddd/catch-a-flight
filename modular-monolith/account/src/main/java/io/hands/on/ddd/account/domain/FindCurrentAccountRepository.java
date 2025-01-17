// ---------------------------------------------------------------------------------------------------------------------
// Copyright (c) 2024 Piotr Marat
// ---------------------------------------------------------------------------------------------------------------------
package io.hands.on.ddd.account.domain;

import io.hands.on.ddd.common.annotation.domain.DomainRepository;
import io.hands.on.ddd.common.annotation.hexagonal.OutboundPort;
import io.hands.on.hands.sharedkernel.CurrentAccount;
import io.hands.on.hands.sharedkernel.Email;

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Implementation
// -------------------------------------------------------------------------------------------------------------------------------------------------------------

/** Functional interface for checking if User is already persisted. */
@OutboundPort
@DomainRepository
public interface FindCurrentAccountRepository {
  CurrentAccount findByEmail(Email email);
}
