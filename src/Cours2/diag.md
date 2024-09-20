```mermaid
graph TD
    A[Début] --> B[Entrée Âge]
    B --> C{Âge < 0 ou Âge > 120?}
    C -- Oui --> D[Afficher Age non valide]
    C -- Non --> E{Âge < 12?}
    E -- Oui --> F[AfficherBonjour Enfant]
    E -- Non --> G{Âge < 18?}
    G -- Oui --> H[Afficher Bonjour Ado]
    G -- Non --> I[Afficher Bonjour Adulte]
    D --> J[Fin]
    F --> J
    H --> J
    I --> J
```