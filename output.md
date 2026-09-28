# Task 1 — Candidate Entities

| Entity | Justification |
|---|---|
| **Customer** | The scenario says the shop has many customers and each customer may bring one or more cars, so Customer represents an independent person in the system. |
| **Car** | The scenario says each car has its own model, plate number, and color and belongs to a customer, so Car is an independent object that needs to be stored. |
| **Mechanic** | The scenario says the shop employs several mechanics, each having a name and specialty, so Mechanic represents an independent employee in the system. |
| **Service Appointment** | The scenario says a mechanic works on a car during a scheduled service appointment, and each appointment has a date and repair note, so Service Appointment represents a specific service event. |

## Descriptive Nouns Excluded as Entities

The following nouns are attributes because they describe an entity rather than representing an independent entity:

- **Model** — describes a Car
- **Plate Number** — describes a Car
- **Color** — describes a Car
- **Name** — describes a Mechanic
- **Specialty** — describes a Mechanic
- **Date** — describes a Service Appointment
- **Repair Note** — describes a Service Appointment