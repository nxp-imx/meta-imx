
#remove cpuburn as it causes build breaks

RDEPENDS_${PN} = " \
    lmbench \
    bonnie++ \
    dbench \
    fio \
    iozone3 \
    iperf \
    nbench-byte \
    tiobench \
"


