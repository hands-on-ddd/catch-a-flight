// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Copyright (c) 2024 Piotr Marat
// -------------------------------------------------------------------------------------------------------------------------------------------------------------
package io.hands.on.hands.sharedkernel;

import io.hands.on.ddd.common.annotation.domain.DomainValueObject;
import java.util.UUID;

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Implementation
// -------------------------------------------------------------------------------------------------------------------------------------------------------------

@DomainValueObject
public record UserId(UUID value) {}
