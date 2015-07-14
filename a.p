diff --git a/imx/meta-bsp/recipes-bsp/firmware-imx/firmware-imx_5.1.bb b/imx/meta-bsp/recipes-bsp/firmware-imx/firmware-imx_5.1.bb
index 33faff5..c0904a7 100644
--- a/imx/meta-bsp/recipes-bsp/firmware-imx/firmware-imx_5.1.bb
+++ b/imx/meta-bsp/recipes-bsp/firmware-imx/firmware-imx_5.1.bb
@@ -10,6 +10,8 @@ SRC_URI[sha256sum] = "b8aa2fbfb16cafb82c6baa01337c109bdd39f698491922635dc40f1e66
 PACKAGES += "${PN}-epdc"
 
 do_install_append() {
+    # Rename folder epdc to imx
+    mv ${D}${base_libdir}/firmware/epdc ${D}${base_libdir}/firmware/imx 
     # Create symbol link for epdc firmware
     rm -rf ${D}${base_libdir}/firmware/imx/epdc_ED060XH2C1.fw
     ln -sf epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc_ED060XH2C1.fw
