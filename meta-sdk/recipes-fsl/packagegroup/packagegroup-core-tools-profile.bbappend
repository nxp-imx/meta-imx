VALGRIND_aarch64 = "valgrind"

# Disable lttng-modules lttng-tools temporarily as there's build break based on k5.5 rebase
RDEPENDS_${PN}_remove = " lttng-modules lttng-tools"
