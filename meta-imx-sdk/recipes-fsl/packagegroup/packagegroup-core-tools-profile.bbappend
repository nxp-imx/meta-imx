VALGRIND:aarch64 = "valgrind"

# Disable lttng-modules lttng-tools temporarily as there's build break based on k5.5 rebase
RDEPENDS:${PN}:remove = " lttng-modules lttng-tools"
