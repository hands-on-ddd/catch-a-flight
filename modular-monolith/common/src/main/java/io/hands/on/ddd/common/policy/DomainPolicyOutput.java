// ---------------------------------------------------------------------------------------------------------------------
// Copyright (c) 2024 Piotr Marat
// ---------------------------------------------------------------------------------------------------------------------
package io.hands.on.ddd.common.policy;

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Implementation
// -------------------------------------------------------------------------------------------------------------------------------------------------------------

/** Domain policy output sealed types. */
public sealed interface DomainPolicyOutput {
  record Allowance() implements DomainPolicyOutput {}

  record Rejection(String reason) implements DomainPolicyOutput {}
}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
