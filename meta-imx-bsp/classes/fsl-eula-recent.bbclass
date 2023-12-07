# fsl-eula-recent.bbclass extends the naming scheme in fsl-eula.bbclass
# to allow for source-specific archives.
IMX_PACKAGE_NAME:append = "-${IMX_SRCREV_ABBREV}"
