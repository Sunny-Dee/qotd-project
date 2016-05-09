    databaseChangeLog = {

    changeSet(author: "delianaescobari (generated)", id: "1462159979171-1") {
        createTable(tableName: "attribution") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "attributionPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "delianaescobari (generated)", id: "1462159979171-2") {
        addColumn(tableName: "quote") {
            column(name: "attribution_id", type: "bigint")
        }
    }

    changeSet(author: "delianaescobari (generated)", id: "1462159979171-3") {
        addForeignKeyConstraint(baseColumnNames: "attribution_id", baseTableName: "quote", constraintName: "FK_pwnr1jk3kqqqts3hgp4u8m6le", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "attribution")
    }
}
