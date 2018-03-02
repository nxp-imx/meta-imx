# Patch for MX8 DRM_VIV
RDEPENDS_${PN}_append_mx8 = " kernel-module-vivante"

DEPENDS_remove = "virtual/libgal-x11"
DEPENDS_append = " libgal-imx"
