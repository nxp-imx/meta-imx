PTEST_ENABLED = "1"

EXTRA_OECONF = "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', '--enable-embedded-tests --enable-asserts --enable-verbose-mode', '--disable-tests', d)} \
                --disable-xml-docs \
                --disable-doxygen-docs \
                --disable-libaudit \
                "

EXTRA_OEMAKE = "${@bb.utils.contains('DISTRO_FEATURES', 'ptest', 'CFLAG_VISIBILITY=-fvisibility=default', '', d)}"
