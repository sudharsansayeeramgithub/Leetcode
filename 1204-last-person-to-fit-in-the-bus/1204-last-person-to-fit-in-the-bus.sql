WITH weight_bus AS (
    SELECT turn, person_name,
    SUM(weight) OVER (ORDER BY turn ASC) AS cumulative_wgt
    FROM Queue
)
SELECT person_name
FROM weight_bus
WHERE turn = (
    SELECT MAX(turn)
    FROM weight_bus
    WHERE cumulative_wgt <= 1000
);
