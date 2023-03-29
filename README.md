# YugabyteDB Anywhere Kubernetes Operator

## Introduction

This is a lightweight Kubernetes operator for YugabyteDB Anywhere. It can perform 3 functions:

 1. Registers an Administrator
 1. Creates a Kubernetes Cloud Provider
 1. Creates a Universe

## Installation

To install the operator, first install YugabyteDB Anywhere in your cluster. Then perform the following steps:

 1. Create a namespace with file [`operator-namespace.yaml`](./kubernetes/operator-namespace.yaml).
 1. Install the CRDs [`adminusers-crd.yaml`](./kubernetes/adminusers-crd.yaml), [`cloudproviders-crd`](./kubernetes/cloudproviders-crd.yaml), and [`universes-crd.yaml`](./kubernetes/universes-crd.yaml).
 1. Edit [`operator-deployment.yaml`](./kubernetes/operator-deployment.yaml) and change the `YBA_HOSTNAME` environment variable to the _Kubernetes_ FQDN DNS name. It should follow the pattern `<yba-service-name>.<yba-namespace>.svc.cluster.local`.
 1. Install the operator with [`operator-deployment.yaml`](./kubernetes/operator-deployment.yaml).

## Planned enhancements

 * Support upgrades of `Universes`
 * Create Helm chart
 * Detect existing `AdminUser` and `CloudProvider`
 * Support deletion of `CloudProvider` and `Universe`

