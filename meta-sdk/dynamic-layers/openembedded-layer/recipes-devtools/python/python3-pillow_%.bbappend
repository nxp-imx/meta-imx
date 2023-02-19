PTEST_ENABLED = "${@bb.utils.contains('DISTRO_FEATURES', 'ptest x11', '1', '0', d)}"
