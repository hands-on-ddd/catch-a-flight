package io.hands.on.hands.sharedkernel;

import io.hands.on.ddd.common.annotation.domain.DomainValueObject;

@DomainValueObject
public record Email(String value) {}
