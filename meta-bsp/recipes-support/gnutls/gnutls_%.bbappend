PACKAGECONFIG:append = " p11-kit"

FILES:${PN}-bin += " \
    ${bindir}/p11tool"
