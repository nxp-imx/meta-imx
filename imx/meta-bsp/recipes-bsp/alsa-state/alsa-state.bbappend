# Update asound.conf for all SoC
FILESEXTRAPATHS_prepend_mx6 := "${THISDIR}/${PN}/imx:"
FILESEXTRAPATHS_prepend_mx7 := "${THISDIR}/${PN}/imx:"


# Append path for freescale layer to include asound.conf & asound.state for i.MX8
FILESEXTRAPATHS_prepend_mx8 := "${BSPDIR}/sources/meta-freescale/recipes-bsp/${PN}/${PN}/imx:"
# Update asound.conf file, using the one under meta-fsl-bsp-release layer
FILESEXTRAPATHS_prepend_mx8 := "${THISDIR}/${PN}/imx:"

PACKAGE_ARCH_mx8 = "${MACHINE_ARCH}"
