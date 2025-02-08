# Disable switch port management
DENY_INTERFACES:mx943-nxp-bsp ??= "eth0,swp0,swp1,swp2"
PACKAGE_ARCH:mx943-nxp-bsp = "${MACHINE_SOCARCH}"
