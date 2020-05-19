

# Archi - ArchiMate Modelling Editor

Archi® is a free, open source, cross-platform tool and editor to create ArchiMate models.

The Archi® modelling tool is targeted toward all levels of Enterprise Architects and Modellers. It provides a low cost to entry solution to users who may be making their first steps in the ArchiMate modelling language, or who are looking for a free, cross-platform ArchiMate modelling tool for their company or institution and wish to engage with the language within a TOGAF® or other Enterprise Architecture framework.

ArchiMate® is an open and independent Enterprise Architecture modelling language that supports the description, analysis and visualization of architecture within and across business domains. ArchiMate is one of the open standards hosted by The Open Group and is fully aligned with TOGAF®.

Archi website:

[https://www.archimatetool.com](https://www.archimatetool.com)


## Building and running the code

All developer resources are here:

[https://github.com/archimatetool/archi/wiki/Developer-Documentation](https://github.com/archimatetool/archi/wiki/Developer-Documentation)


## Contributing code to Archi

Please see [How can I contribute code to Archi?](https://github.com/Phillipus/archi/wiki/How-can-I-contribute-code-to-Archi%3F)


## A propos du Français

Plus d'informations se trouvent notament [ici](https://github.com/archimatetool/archi/wiki/Translating-Archi)
Toutes définitions a été traduite conformément à la [publication officielle de l'Open Group](https://publications.opengroup.org/c204)

### Installation et mise en oeuvre 

1. Télécharger le fichier dropins.zip de la release, ou chaque .jar individuellement
2. Dézipper le fichier, et/ou déplacer l'ensemble des .jar dans le dossier du répertoire d'installation Archi
Le package contient également le contenu du projet Babel FR, traduction d'eclipse en français

### TODO: 

- com.archimatetool.model.viewpoints : ViewPointsManager_0 = None
- com.archimatetool.editor     : command.name = Show Navigator View
- com.archimatetool.editor     : keyword (tous)
    - .preferences             : "label background", "clipped", "Hard" / "Soft"
    - .utils                   : have to check "Copying" & "Moving" context
    - .diagram                 : "Connection Router"
      - .actions         : Impression "Tiled" ?
      - .figures.diagram :  "Type : View Reference"
      - .policies        : "Reconnect" ?
      - .commands        : "Add view reference"
      - .commands        : "Move/Size {0}"
    - .model                   : "Wrong number of diagram component instances"
    - .ui                      : Check "{0} connects to {1}" -> "{0} est relié à {1}"
      - .factory.diagram     :  "View Reference"
    - .propertysections        : "Show label" ?
                               : "Connection Router:"

